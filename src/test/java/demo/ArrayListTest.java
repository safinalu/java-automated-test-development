package demo;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Test Case
 */
public class ArrayListTest { //SUT
    @Test
    public void shouldGetElementWhenAddNullElement() { //BDD
        //region Fixture | Arrange | Given
        ArrayList<Object> sut = new ArrayList<>();
        Object dummyElement = null;
        //endregion

        //region Act | When
        sut.add(dummyElement);
        //endregion

        //region Assert | Then
        assertEquals("", dummyElement, sut.get(0));
        //endregion
    }
}
