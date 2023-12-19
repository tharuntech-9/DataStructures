package com.avltree.main;

import com.avltree.bean.AVLTree;

public class Main {

	public static void main(String[] args) {

		AVLTree tree = new AVLTree();

		tree.insert(30);

		tree.insert(10);
		tree.insert(5);
		tree.insert(3);
		tree.insert(4);
		tree.insert(50);
		tree.insert(65);
		tree.insert(1);

		tree.levelOrderTraversal();
		tree.printTreeGraphically();

		
		tree.deleteNodeOfBST(5);
		tree.printTreeGraphically();

		tree.insert(2);
		tree.printTreeGraphically();

		tree.deleteNodeOfBST(4);
		tree.printTreeGraphically();

		tree.insert(20);
		tree.deleteNodeOfBST(65);
		tree.printTreeGraphically();

		tree.insert(40);
		tree.deleteNodeOfBST(20);
		tree.printTreeGraphically();

	}
}
