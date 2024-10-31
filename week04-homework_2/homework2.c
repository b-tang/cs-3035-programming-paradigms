#include <stdio.h>
#include <stdlib.h>

// struct for Monster's: id, name, location, victims
typedef struct Monster
{
    int id;
    int victims;
    char name[50];
    char location[100];
} Monster;

// function gets the attacks info from user
Monster *getAttacks(Monster *attacks, int *size)
{
    int numberOfAttacks;
    char tempChar;

    printf("Enter the number of monster attacks: ");
    scanf("%d", &numberOfAttacks);
    scanf("%c", &tempChar);

    // Creates monster attack array
    attacks = (Monster *)malloc(sizeof(Monster) * numberOfAttacks);

    // Stores the user input of Monster info
    for (int i = 0; i < numberOfAttacks; ++i)
    {
        printf("Attack #%d\n", (i + 1));
        printf("----------\n");
        ;
        attacks[i].id = (i + 1);
        printf("Monster's name: ");
        fgets(attacks[i].name, 50, stdin);

        printf("Attack location: ");
        fgets(attacks[i].location, 100, stdin);

        printf("Number of victims: ");
        scanf("%d", &attacks[i].victims);
        printf("\n");
        scanf("%c", &tempChar);
    }
    *size = numberOfAttacks;
    return attacks;
}

// shows the Monster details
void display(Monster *monster, int num)
{
    printf("\nDetail of the Monster Attacks\n");
    printf("--------------------\n");
    for (int i = 0; i < num; ++i)
    {
        printf("Attack id: %d\n", monster[i].id);
        printf("Monster's name: %s", (monster + i)->name);
        printf("Attack location: %s", (monster + i)->location);
        printf("Victims: %d\n", (monster + i)->victims);
        printf("--------------------\n");
    }
}

// display the total amount of victims for all attacks
void totalVictims(Monster *monster, int num)
{
    int total = 0;
    for (int i = 0; i < num; i++)
    {
        total += (monster + i)->victims;
    }
    printf("The total number of victims is %d.\n", total);
}

int main()
{
    // struct Monster pointer
    Monster *monster = NULL;
    int size;

    // get and show the values from the user and the total amount of victims 
    monster = getAttacks(monster, &size);
    display(monster, size);
    totalVictims(monster, size);
    return 0;
}