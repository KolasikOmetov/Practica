#pragma once
#include <iostream>
#include <string>

using namespace std;


class MyTree
{
public:
	int data;
	struct MyTree* left;
	struct MyTree* right;
	int x_Element;
	int y_Element;


	struct MyTree* treeGreen(struct MyTree* tree);

	struct MyTree* addElement(struct MyTree* tree, int value);

	bool contains(struct MyTree* tree, int value);
};



