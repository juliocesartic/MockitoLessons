package com.in28minutes.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.anyInt;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class TestList {

	@Test
	public void letsMockListSizeMethod() {
		List mock = Mockito.mock(List.class);
		Mockito.when(mock.size()).thenReturn(2);
		
		assertEquals(2, mock.size());
		
		
	}
	
	
	@Test
	public void letsMockListSizeMethod_ReturnMultipleValues() {
		List mock = Mockito.mock(List.class);
		Mockito.when(mock.size()).thenReturn(2).thenReturn(3);
		
		assertEquals(2, mock.size());
		assertEquals(3, mock.size());
		
		
	}
	
	@Test
	public void letsMockListSizeGet() {
		List mock = Mockito.mock(List.class);
		Mockito.when(mock.get(anyInt())).thenReturn("SameResult");
		
		assertEquals("SameResult", mock.get(0));
		assertEquals("SameResult", mock.get(1));
		
		
	}
	
	@Test(expected = RuntimeException.class)
	public void letsMockList_throwAnException() {
		List mock = Mockito.mock(List.class);
		Mockito.when(mock.get(anyInt())).thenThrow(new RuntimeException("Message Exception"));
		
		mock.get(0);
		
		
	}
	
	
	@Test
	public void letsMockListSizeGet_usingBDD() {
		
		//Given
		List<String> mock = Mockito.mock(List.class);
		given(mock.get(anyInt())).willReturn("SameResult");
		//when
		
		String firstElement = mock.get(0);
		
		//then
		assertEquals("SameResult", firstElement);
		
		
	}

}
