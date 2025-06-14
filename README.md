# Object Oriented Design Patterns

A project demonstrating various design patterns in Kotlin, organized by categories.

## Structural Patterns

Structural patterns explain how to assemble objects and classes into larger structures while keeping these structures flexible and efficient.

- **Adapter**: Allows incompatible interfaces to work together by wrapping an object in an adapter to make it compatible with another class
- **Bridge**: Separates an abstraction from its implementation so both can vary independently
- **Composite**: Composes objects into tree structures to represent part-whole hierarchies
- **Decorator**: Dynamically adds responsibilities to objects without altering their structure
- **Facade**: Provides a simplified interface to a complex subsystem
- **Flyweight**: Reduces the cost of creating and manipulating a large number of similar objects
- **Proxy**: Provides a surrogate or placeholder for another object to control access to it

## Behavioral Patterns

Behavioral patterns are concerned with communication between objects, how objects interact and distribute responsibility.

- **Chain of Responsibility**: Passes requests along a chain of handlers
- **Command**: Turns a request into a stand-alone object containing all information about the request
- **Interpreter**: Implements a specialized language
- **Iterator**: Accesses elements of a collection sequentially without exposing its underlying representation
- **Mediator**: Reduces coupling between classes by having them communicate via a mediator object
- **Memento**: Captures and restores an object's internal state
- **Observer**: Defines a subscription mechanism to notify multiple objects about events
- **State**: Allows an object to alter its behavior when its internal state changes
- **Strategy**: Defines a family of algorithms and makes them interchangeable
- **Template Method**: Defines the skeleton of an algorithm, letting subclasses override specific steps
- **Visitor**: Separates algorithms from the objects on which they operate

## Creational Patterns

Creational patterns provide various object creation mechanisms that increase flexibility and reuse of existing code.

- **Abstract Factory**: Creates families of related objects
- **Builder**: Constructs complex objects step by step
- **Factory Method**: Creates objects without exposing the instantiation logic
- **Prototype**: Creates new objects by cloning an existing object
- **Singleton**: Ensures a class only has one instance
