# Burger Maker App
The Burger Maker App is a command-line app that demonstrates the use of various design patterns, 
such as the Factory Pattern, Template Pattern, State Pattern, Decorator Pattern, and Composite
Pattern. The objective was to use 1 Creational GoF pattern, 1 Behavior GoF pattern and 1 Structural 
GoF pattern. The solution must use at least 4 non-Creational GoF patterns in total.

## Design patterns used
### Factory pattern (Creational)
The Factory Pattern is used to create different types of burgers, such as Cheeseburger and 
Veggieburger. The burger Factory class is responsible for creating instances of these burger types based 
on input. (https://www.baeldung.com/java-factory-pattern)

### Template pattern (Behavior)
The Template Pattern is used to provide template methods that define the steps for making a burger. 
The BurgerMaker class serves as the  template and the concrete Cheeseburger and Veggieburger inherit
from the BurgerMaker class and implement the specific steps for building their respective burgers.
(https://www.geeksforgeeks.org/template-method-design-pattern/)

### State pattern (Behavior)
The State Pattern is used to manage the different states of the burger order - such as order is 
accepted, order is complete etc. The OrderState interface defines the common method for printing the
state of the order and the OrderedState, DoneState and FriesState implement the specific behavior 
for each state. The Order class provides the context for displaying these states in the overall 
ordering process, combining the implementation of behavior in other patterns.
(https://www.geeksforgeeks.org/state-design-pattern/)

### Decorator pattern (Structural)
The Decorator Pattern is used to add additional functionalities to the burgers, such as adding a
side of fries. The BurgerDecorator interface defines the common methods i.e. overrides the methods
coming from the Burger interface itself, while the concrete decorator class FriesDecorator adds the
specific side and increases the price of the burger.
(https://www.baeldung.com/java-decorator-pattern)

### Composite pattern (Structural)
The Composite Pattern is used to represent a collection of Order number and Burger name in a single 
entity - the Order Screen. The Order State interface defines the common method for handling the
Burger name and Order number. The Order State interface is implemented by the Order and BurgerMaker 
classesThe OrderScreenImpl acts as the composite that contains these components and provides methods
for adding/removing them.
(https://www.geeksforgeeks.org/composite-design-pattern/)

## How to run the app
1. Compile and run the main method of the OodpApplication class.

![borgir](https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRe41Bbo5KYbkkXT4PE0vay7ASvKm0uG-dqYwn1OCmxIGv59b5K)