#include <iostream>// Importing IO file
#include <fstream>// Importing IO file handling class
#include <stdlib.h>// Importing standard library file
#include <cstdlib>

using namespace std;

//global variab;e declaration
string fname, lname, phone_num;
int option;

//auxilliary global function
void menuScreen();
void addContact(); //writes new contacts to file and saves 
void searchContact(); //searches DB and returns a contact when found 
void help(); //takes you back to the main menu
void self_exit(); //exits app
bool check_digits(string); //verifies that only numbers have been entered
bool check_numbers(string); //verifies that phone numbers are 10 digits

// Method 1

void self_exit()
{
	system("clear");
	cout << "\nthank you for using phone directory!\n";
	exit(1);

	system("clear");
}

// Method 2

void help()
{
	system("clear");
	cout << "------------Help Center------------";
	while (true) {
		cout << "\nenter 0 to go back to the main menu:"; 
		cin >> option;//reading data from standard Input
		if (option == 0) {
			system("clear");
			menuScreen();
		}
	}
}

// Method 3
void addContact()
{
	ofstream phone("number.txt", ios::app);
	system("clear");
	cout << "\n\n\tenter first name: ";
	cin >> fname;
	cout << "\n\tenter last name: ";
	cin >> lname;
	cout << "\n\tenter phone number : ";
	cin >> phone_num;

	if (check_digits(phone_num) == true) {
		if (check_numbers(phone_num) == true) {
			if (phone.is_open()) {
				phone << fname << " " << lname << " "
					<< phone_num << endl;
				cout << "------------------------------------\n";
				cout << "\n\tContact saved successfully !";
			}
			else {
				cout << "------------------------------------\n";
				cout << "\n\tError in opening record!";
			}
		}
		else {
			cout << "------------------------------------\n";
			cout << "\n\tOnly numbers are allowed!";
		}
	}
	else {
		cout << "------------------------------------\n";
		cout << "\n\tPhone number should be of 10 digits "
				"only.";
	}
	cout << endl << endl;

	phone.close();
}

// Method 4
void searchContact()
{
	bool found = false;
	ifstream myfile("number.txt");
	string keyword;
	cout << "\n\tenter Name to search: ";
	cin >> keyword;
	while (myfile >> fname >> lname >> phone_num) {
		if (keyword == fname || keyword == lname) {
			system("clear");
			cout << "\n\n\n\t\tCONTACT DETAILS";
			cout << "------------------------------------\n";
			cout << "\n\nfirst Name: " << fname;
			cout << "\nlast Name : " << lname;
			cout << "\nphone Number : " << phone_num;
			found = true;
			break;
		}
	}
	if (found == false)
		cout << "\nNo such contact is found!";

	cout << endl << endl;
	//system("pause");
	//system("clear");
}

// Method 5
bool check_digits(string x)
{
	if (x.length() == 10)
		return true;
	else
		return false;
}

// Method 6
bool check_numbers(string x)
{
	bool check = true;

	for (int i = 0; i < x.length(); i++) {
		if (!(int(x[i]) >= 48 && int(x[i]) <= 57)) {
			check = false;
			break;
		}
	}

	if (check == true)
		return true;

	if (check == false)
		return false;

	//cout << endl << endl;
}

void menuScreen() {

	system("clear");
	
		cout << "\n\t------------Contact saver app------------";
		cout << "\n\t1. Add Contact\n\t2. Search "
				"Contact\n\t3. Help\n\t4. Exit\n\t> ";
		cout << "\n\tchoose an option: ";
		cin >> option;

		// Switch case
		switch (option) {
		case 1:
			addContact();
			break;

		case 2:
			searchContact();
			break;

		case 3:
			help();
			break;

		case 4:
			self_exit();
			break;

		default:
			cout << "\n\tInvalid Input(pick a number between 1 - 4)!";
		}

	//system("clear");

}

int main()
{
	menuScreen();
	return 0;
}
