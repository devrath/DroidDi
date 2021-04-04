![Banner](images/Logo-new.png)

# DroidDi
This project demonstrates how to use various dependency injection methodologies in android

---
### What is Dependency Injection

* Consider any two classes `Class-A`,`Class-B`, Now to create a object of a `Class-A`, we need to instantiate `Class-B`. Here the `Class-A` is dependent on `Class-B`. The relationship between them called `dependency`
* Now more examples we can have are as `Image loader using okhttp`, Here `Image Loader` is the dependent and `okhttp` is the dependency
* Consider there are two classes `StudentClass` and `AddressClass`, And `StudentClass` is having a address field, Now this states `StudentClass` has a dependency on `AddressClass`
* Another representation is `RecyclerView` class needs `Adapter` to build rows one by one. So `RecyclerView` has a dependency on `Adapter` 

---

### Why dependency injection is needed

* Consider there is a process of building a car, now building a car involves assembling many components into the car like engine, seat, glass, door etc.
* Now when we are building the car we need to build all the components and add them. 
* Okay what happens when we do this and we require to build another car, In this scenario we need to build all of them again.
* This is a hard task, what if we could simplify this process, like build the things outside and provide them while assembling the class.
* By this way we can modify the configuration of individual components not affecting the entire assembly process.
* This also involves unit testing the individual components. 
* Providing the dependencies via a constructor, We can make the car class work, If we want to test the car as a whole, we can mock the dependencies and make the car testable.
* Now some of the dependencies can be same, like if we have a driver who delivers the car from manifacturing center to storage, instead of using a new driver again and again, we can use the same driver. We can call this as a singleton in terms of software.





| Quick Reference |
| --- |
| [Dagger](https://github.com/devrath/DroidDi/blob/main/README.md#dagger "Dagger2") |
| Koin |
| Hilt |


<h2>Dagger</h2>

<p align="center">
  <img width="400" height="200" src="https://github.com/devrath/DroidDi/blob/main/images/dagger.jpeg">
</p>
