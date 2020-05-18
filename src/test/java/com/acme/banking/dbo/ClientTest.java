package com.acme.banking.dbo;

import com.acme.banking.dbo.domain.Client;
import org.junit.Test;

import java.util.UUID;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertThat;

public class ClientTest {
    @Test
    public void shouldSavePropertiesWhenCreated() {
        //region given
        UUID stubId = UUID.randomUUID();
        String dummyClientName = "dummy client name";
        //endregion

        //region when
        Client sut = new Client(stubId, dummyClientName);
        //endregion

        //region then
        assertThat(sut.getId(),
                allOf(
                        equalTo(stubId),
                        notNullValue()
                ));
        assertThat(sut.getName(),
                allOf(
                        equalTo(dummyClientName),
                        notNullValue()
                ));
        //endregion
    }

    @Test
    public void shouldNotBeCreatedWhenIdNull() {
        //region given
        UUID stubId = null;
        String dummyClientName = "dummy client name";
        //endregion

        //region when
        Exception exception = createClientWithException(stubId, dummyClientName);
        //endregion

        //region then
        assertThatIllegalArgumentExceptionWithMessage(exception, "Id must not be null");
        //endregion
    }

    @Test
    public void shouldNotBeCreatedWhenNameNull() {
        //region given
        UUID stubId = UUID.randomUUID();
        String dummyClientName = null;
        //endregion

        //region when
        Exception exception = createClientWithException(stubId, dummyClientName);
        //endregion

        //region then
        assertThatIllegalArgumentExceptionWithMessage(exception, "Name must not be null");
        //endregion
    }

    private Exception createClientWithException(UUID stubId, String clientName) {
        Exception exception = null;
        try {
            Client sut = new Client(stubId, clientName);
        } catch (Exception e) {
            exception = e;
        }
        return exception;
    }

    private void assertThatIllegalArgumentExceptionWithMessage(Exception exception, String s) {
        assertThat(exception,
                allOf(
                        notNullValue(),
                        instanceOf(IllegalArgumentException.class)
                ));
        assertThat(exception.getMessage(), equalTo(s));
    }
}
