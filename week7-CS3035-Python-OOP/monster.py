class Monster:
    # __init__ constructor method
    def __init__(temp, name, size):
        temp.name = name
        temp.size = size
    
    # attack method implementation
    def attack(temp, location):
        print(f'{temp.name} attacks {location}')
        
    # getters and setters
    def getName(temp):
        return temp.name
    def setName(temp, name):
        temp.name = name
    def getSize(temp):
        return temp.size
    def setSize(temp, size):
        temp.size = size
    
    # __str__ implement method 
    def __str__(temp):
        return f'Name: {temp.name}, Size: {temp.size}'
    
    # __eq__ overloads double equals operator method
    def __eq__(temp, monster):
        return temp.name == monster.name and temp.size == monster.size
    
    # __add__ method override 
    def __add__(temp, monster):
        nameOverride = temp.name + monster.name
        sizeOverride = temp.size + monster.size
        return Monster(nameOverride, sizeOverride)
    
# Monster class test
monster1 = Monster('Godzilla', 90000)
monster2 = Monster('Dracula', 50)
monster3 = Monster('Godzilla', 90000)
monster4 = Monster('Kong', 50000)

# attack method test
monster1.attack('Tokyo')

# getters and setters test
monster2.setName('Bigfoot')
monster2.setSize(30)
print(monster2.getName(), monster2.getSize())

# __str__ method print test
print(monster1)

# __eq__ true/false method test
print(monster1 == monster3) 
print(monster1 == monster2) 

# __add__ method monster1 + monster4 print test 
monster5 = monster1 + monster4
print(monster5) 