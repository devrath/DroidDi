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

---

### Do we require a tool like (`dagger`,`koin`,`hilt`) to inject dependencies 

We don't requre a tool to inject dependencies, But using a tool, what it does is that it constructs the dependenciees in the right order as we need them and provide them to the dependent object avoiding the boiler plate code.

---

| Quick Reference |
| --- |
| [Dagger](https://github.com/devrath/DroidDi/blob/main/README.md#dagger "Dagger2") |
| Koin |
| Hilt |

---

<center><h2>Dagger</h2></center>

<p align="center">
  <img width="400" height="200" src="https://github.com/devrath/DroidDi/blob/main/images/dagger.jpeg">
</p>


| Concept |
| --- |
| [Constructor Injection](https://github.com/devrath/DroidDi/blob/main/README.md#------------------------------------------------------------constructor-injection-) |
| [Field Injection](https://github.com/devrath/DroidDi/blob/main/README.md#------------------------------------------------------------field-injection-) |
| [Provides Annotation](https://github.com/devrath/DroidDi/blob/main/README.md#------------------------------------------------------------provides-annotation-) |
| [Binds Annotation](https://github.com/devrath/DroidDi/blob/main/README.md#------------------------------------------------------------binds-annotation-) |



<h3> <----------------------------------------------------------> Constructor Injection </h3> 

`Description::`

* Here we have `Car` class. The class has 2 dependencies `Wheels`,`Engine`. Here using the process of dependency injection, we create the dependencies of the `Wheels` and `Engine` outside and provide the dependecy via the constructor, so that the instantiation of the components inside the car is not necessary be done inside the car class.
* We need to use constructor injection wherever necessary.

<details><summary>DEMO  -  click to view</summary>
<p>

**[Battery](app/src/main/java/com/demo/code/typesofdi/dagger/sampleone/concepts/constructorInjection/phoneParts/Battery.kt)**
     <->
     **[Phone](app/src/main/java/com/demo/code/typesofdi/dagger/sampleone/concepts/constructorInjection/phoneParts/Phone.kt)**
     <->
     **[SdCard](app/src/main/java/com/demo/code/typesofdi/dagger/sampleone/concepts/constructorInjection/phoneParts/SdCard.kt)**
     <-> 
     **[PhoneComponent](app/src/main/java/com/demo/code/typesofdi/dagger/sampleone/concepts/constructorInjection/di/components/PhoneComponent.kt)**
     <->
     **[View](app/src/main/java/com/demo/code/typesofdi/dagger/sampleone/concepts/constructorInjection/view/ConstructorInjectionFragment.kt)**
</p>
</details>

     
<details><summary>Output  -  click to view</summary>
<p>

```
2021-04-10 21:24:16.553 26840-26840/com.demo.code D/Dagger: Battery Init is invoked
2021-04-10 21:24:16.553 26840-26840/com.demo.code D/Dagger: SdCard Init is invoked
2021-04-10 21:24:16.554 26840-26840/com.demo.code D/Dagger: Phone Init is invoked
2021-04-10 21:24:16.554 26840-26840/com.demo.code D/Dagger: Phone Initialize function is invoked
```
</p>
</details>

<h3> <----------------------------------------------------------> Field Injection </h3> 
  
**Description**:
* The field injection is used wherever the `constructor injection` is not possible.
* Most of the scenarios in android, where we want to use a third party library, we use `field injection`
* We use `@Inject` annotation with public access specifier.
* As a thumb rule, Field Injection is used for framework types


<h3> <----------------------------------------------------------> Provides Annotation </h3> 

**Description**:
* From the examples above we saw that we might need to annotate the constructor of the object we are constructing.
* Most of the time the constructor we are annotating are of third party libraries, We don't have access to third party libraries.
* Using the `@Provides` annotation, we can use it.


<h3> <----------------------------------------------------------> Binds Annotation </h3> 
 
**Description**:
* Now there are scenarios when we need to inject a `interface` instead of a `class`, In such scenarios we use `Binds` annotation
* We can't create a module directly for a interface but instead, we will make a class implement the imterface and create a module of that class
* We shall keep the class as `abstract` as a standard practice, even though we can implement in a standard way
* Now in a scenario, if we have two modules implementing same interface, then we will get a error because dagger dosen't know which one to use

