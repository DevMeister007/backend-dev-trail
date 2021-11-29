//program to count consonants, vowels and whitespaces in a string
#include<stdio.h>
#include<string.h>

 void vowelKCount();

int main(void)
    {  
        
        vowelKCount();

        return 0;
    }

    void vowelKCount()
        {
            //declaring string
        char str[100];

        //requesting for user input
        printf("------------------------------\n");
        printf("enter string: ");
        fgets(str, sizeof(str), stdin);

            int vowel, K;
            int whitespaces;

            for (int i = 0; i != '\0'; ++i)
                {
                    if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u')
                        {
                            ++vowel;
                        }

                    else if (str[i] == ' ')
                        
                        {

                            ++whitespaces;  
                         }

                    else
                        {
                             ++K;
                        }
            
                }
            
             //outputting to screen
        printf("-------------------------------\n");
        printf("There are (%i), (%i), (%i) vowels, consonants, whitespaces in your text\n", vowel, K, whitespaces);

        }
            
