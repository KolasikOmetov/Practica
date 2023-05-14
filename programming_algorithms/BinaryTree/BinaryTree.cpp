// BinaryTree.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include "MyTree.h"
#include <string>
using namespace std;

int main()
{
	int ElementTree;

	int m = 0;

	int mass[100] = {};

	struct MyTree* root = NULL;

	int commands = 0;

	while (m < 100) {
		std::cout << "Input command 0 - add element, 1 - find element \n";
		std::cin >> commands;
		std::cout << "Input element \n";
		std::cin >> ElementTree;
		if (ElementTree) {
			if (commands == 0) {
				root = root->addElement(root, ElementTree);
				m++;
			}

			if (commands == 1 && root != NULL) {
				bool answer = root->contains(root, ElementTree);
				std::cout << answer << "\n";
			}
		}
	}
}
