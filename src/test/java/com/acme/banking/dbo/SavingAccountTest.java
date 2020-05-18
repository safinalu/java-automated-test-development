package com.acme.banking.dbo;

import com.acme.banking.dbo.domain.Client;
import com.acme.banking.dbo.domain.SavingAccount;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.UUID;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertThat;

public class SavingAccountTest {
    @Test
    public void shouldSavePropertiesWhenCreated() {
        //region given
        UUID stubId = UUID.randomUUID();
        Client dummyClient = new Client(UUID.randomUUID(), "dummy client name");
        double dummyAmount = 1;
        //endregion

        //region when
        SavingAccount sut = new SavingAccount(stubId, dummyClient, dummyAmount);
        //endregion

        //region then
        assertThat(sut.getId(),
                CoreMatchers.allOf(
                        CoreMatchers.equalTo(stubId),
                        CoreMatchers.notNullValue()
                ));
        assertThat(sut.getClient(),
                CoreMatchers.allOf(
                        CoreMatchers.equalTo(dummyClient),
                        CoreMatchers.notNullValue()
                ));
        assertThat(sut.getClientId(),
                CoreMatchers.allOf(
                        CoreMatchers.equalTo(dummyClient.getId()),
                        CoreMatchers.notNullValue()
                ));
        assertThat(sut.getAmount(),
                CoreMatchers.allOf(
                        CoreMatchers.equalTo(dummyAmount),
                        CoreMatchers.notNullValue()
                ));
        //endregion
    }

    @Test
    public void shouldNotBeCreatedWhenIdNull() {
        //region given
        UUID stubId = null;
        Client dummyClient = new Client(UUID.randomUUID(), "dummy client name");
        double dummyAmount = 1;
        //endregion

        //region when
        Exception exception = createClientWithException(stubId, dummyClient, dummyAmount);
        //endregion

        //region then
        assertThatIllegalArgumentExceptionWithMessage(exception, "Id must not be null");
        //endregion
    }

    @Test
    public void shouldNotBeCreatedWhenClientNull() {
        //region given
        UUID stubId = UUID.randomUUID();
        Client dummyClient = null;
        double dummyAmount = 1;
        //endregion

        //region when
        Exception exception = createClientWithException(stubId, dummyClient, dummyAmount);
        //endregion

        //region then
        assertThatIllegalArgumentExceptionWithMessage(exception, "Client must not be null");
        //endregion
    }

    @Test
    public void shouldNotBeCreatedWhenAmountNegative() {
        //region given
        UUID stubId = UUID.randomUUID();
        Client dummyClient = new Client(UUID.randomUUID(), "dummy client name");
        double dummyAmount = -1;
        //endregion

        //region when
        Exception exception = createClientWithException(stubId, dummyClient, dummyAmount);
        //endregion

        //region then
        assertThatIllegalArgumentExceptionWithMessage(exception, "Amount must be a non-negative value");
        //endregion
    }

    private Exception createClientWithException(UUID stubId, Client client, double amount) {
        Exception exception = null;
        try {
            SavingAccount sut = new SavingAccount(stubId, client, amount);
        } catch (Exception e) {
            exception = e;
        }
        return exception;
    }

    private void assertThatIllegalArgumentExceptionWithMessage(Exception exception, String s) {
        assertThat(exception,
                CoreMatchers.allOf(
                        CoreMatchers.notNullValue(),
                        instanceOf(IllegalArgumentException.class)
                ));
        assertThat(exception.getMessage(), CoreMatchers.equalTo(s));
    }
}
