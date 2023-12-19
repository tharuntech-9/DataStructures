package com.doublelinkedlist.node;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class DoubleNode {
	
	private int value;
	private DoubleNode next;
	private DoubleNode prev;
}
