#include "MyTree.h"
#include <iostream>
#include <string>

int flag;
int nTree;
using namespace std;

struct MyTree* MyTree::treeGreen(struct MyTree* tree) {
	if (tree->data != NULL) {
		if (tree->left != NULL)
			tree->left = treeGreen(tree->left);
		if (tree->right != NULL)
			tree->right = treeGreen(tree->right);
	}
	return tree;
}

struct MyTree* MyTree::addElement(struct MyTree* tree, int value)
{
	if (nTree < 31) {
		if (tree == NULL) {
			tree = (struct MyTree*)malloc(
				sizeof(struct MyTree));
			tree->data = value;
			tree->left = tree->right = NULL;
			nTree++;
		}
		else if (tree->data == value) {
		}
		else if (value < tree->data) {
			tree->left = addElement(tree->left, value);
		}
		else  if (value > tree->data) {
			tree->right = addElement(tree->right, value);
		}
	}
	return tree;
}

bool MyTree::contains(struct MyTree* tree, int value)
{
	if (tree == NULL) {
		flag = -1;
		return tree;
	}
	else if (value == tree->data) {
		flag = value;
		return tree;
	}
	else if (value < tree->data) {
		contains(tree->left, value);
	}
	else if (value > tree->data) {
		contains(tree->right, value);
	}
}