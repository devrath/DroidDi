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
| [Hilt](https://github.com/devrath/DroidDi/blob/main/README.md#hilt) |

---

<center><h2>Dagger</h2></center>

<p align="center">
  <img width="400" height="200" src="https://github.com/devrath/DroidDi/blob/main/images/dagger.jpeg">
</p>


| Concept |
| --- |
| [Constructor Injection](https://github.com/devrath/DroidDi/blob/main/README.md#------------------------------------------------------------constructor-injection-) |
| [Field Injection & Provides Annotation](https://github.com/devrath/DroidDi/blob/main/README.md#------------------------------------------------------------field-injection-) |
| [Binds Annotation](https://github.com/devrath/DroidDi/blob/main/README.md#------------------------------------------------------------binds-annotation-) |
| [Dynamic Values Injection](https://github.com/devrath/DroidDi#------------------------------------------------------------adding-dynamic-values-) |
| [Singleton scope](https://github.com/devrath/DroidDi/blob/main/README.md#------------------------------------------------------------singleton-scope-) |
| [Custom scope](https://github.com/devrath/DroidDi#------------------------------------------------------------custom-scope-) |

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
  
`Description::`
* The field injection is used wherever the `constructor injection` is not possible.
* Most of the scenarios in android, where we want to use a third party library, we use `field injection`
* We use `@Inject` annotation with public access specifier.
* As a thumb rule, Field Injection is used for framework types
* Most of the time the constructor we are annotating are of third party libraries, We don't have access to third party libraries.
* Using the `@Provides` annotation, we can use it.

<details><summary>DEMO  -  click to view</summary>
<p>
  
**[ThirdPartyCapacitor](app/src/main/java/com/demo/code/typesofdi/dagger/sampleone/concepts/fieldInjection/tvParts/ThirdPartyCapacitor.kt)**
     <->
     **[ThirdPartyMotor](app/src/main/java/com/demo/code/typesofdi/dagger/sampleone/concepts/fieldInjection/tvParts/ThirdPartyMotor.kt)**
     <->
     **[Tv](app/src/main/java/com/demo/code/typesofdi/dagger/sampleone/concepts/fieldInjection/tvParts/Tv.kt)**
     <-> 
     **[ThirdPartyCapacitorModule](app/src/main/java/com/demo/code/typesofdi/dagger/sampleone/concepts/fieldInjection/di/modules/ThirdPartyCapacitorModule.kt)**
     <->
     **[ThirdPartyMotorModule](app/src/main/java/com/demo/code/typesofdi/dagger/sampleone/concepts/fieldInjection/di/modules/ThirdPartyMotorModule.kt)**
     <->
     **[TvModule](app/src/main/java/com/demo/code/typesofdi/dagger/sampleone/concepts/fieldInjection/di/modules/TvModule.kt)** 
     <->
     **[TvComponent](app/src/main/java/com/demo/code/typesofdi/dagger/sampleone/concepts/fieldInjection/di/components/TvComponent.kt)** 
     <->
     **[FieldInjectionFragment](app/src/main/java/com/demo/code/typesofdi/dagger/sampleone/concepts/fieldInjection/view/FieldInjectionFragment.kt)**
</p>
</details>

<details><summary>Output  -  click to view</summary>
<p>

When we load the fragment dependent classes are instantiated since we inject the variable tv 

```
2021-04-11 19:50:41.599 10800-10800/com.demo.code D/Dagger: ThirdPartyCapacitor is charging
2021-04-11 19:50:41.599 10800-10800/com.demo.code D/Dagger: ThirdPartyMotor is running
2021-04-11 19:50:41.599 10800-10800/com.demo.code D/Dagger: Tv is constructed
```

When we click the button we can access the method of tv class
```
2021-04-11 19:51:28.808 10800-10800/com.demo.code D/Dagger: Tv has turned on!
```

</p>
</details>

<h3> <----------------------------------------------------------> Binds Annotation </h3> 
 
**Description**:
* Now there are scenarios when we need to inject a `interface` instead of a `class`, In such scenarios we use `Binds` annotation
* We can't create a module directly for a interface but instead, we will make a class implement the imterface and create a module of that class
* We shall keep the class as `abstract` as a standard practice, even though we can implement in a standard way
* Now in a scenario, if we have two modules implementing same interface, then we will get a error because dagger dosen't know which one to use

<details><summary>DEMO  -  click to view</summary>
<p>

**[PetrolEngineModule](app/src/main/java/com/demo/code/typesofdi/dagger/sampleone/concepts/bindsAnnotaion/di/module/PetrolEngineModule.kt)**
     <->
     **[WheelsModule](app/src/main/java/com/demo/code/typesofdi/dagger/sampleone/concepts/bindsAnnotaion/di/module/WheelsModule.kt)**
     <->
     **[CarComponent](app/src/main/java/com/demo/code/typesofdi/dagger/sampleone/concepts/bindsAnnotaion/di/components/CarComponent.kt)**
     <-> 
     **[Car](app/src/main/java/com/demo/code/typesofdi/dagger/sampleone/concepts/bindsAnnotaion/vehicleParts/Car.kt)**
     <->
     **[Engine](app/src/main/java/com/demo/code/typesofdi/dagger/sampleone/concepts/bindsAnnotaion/vehicleParts/Engine.kt)**
     <->
     **[PetrolEngine](app/src/main/java/com/demo/code/typesofdi/dagger/sampleone/concepts/bindsAnnotaion/vehicleParts/PetrolEngine.kt)** 
     <->
     **[Wheels](app/src/main/java/com/demo/code/typesofdi/dagger/sampleone/concepts/bindsAnnotaion/vehicleParts/Wheels.kt)** 
     <->
     **[BindsAnnotationFragment](app/src/main/java/com/demo/code/typesofdi/dagger/sampleone/concepts/bindsAnnotaion/view/BindsAnnotationFragment.kt)**
</p>
</details>

<details><summary>Output  -  click to view</summary>
<p>

When we load the fragment dependent classes are instantiated since we inject the variable tv 

```
2021-04-11 22:08:20.333 8028-8028/com.demo.code D/Dagger: Petrol engine is constructed
2021-04-11 22:08:20.333 8028-8028/com.demo.code D/Dagger: Wheel is constructed
```

When we click the button we can access the method of car class
```
2021-04-11 22:08:38.237 8028-8028/com.demo.code D/Dagger: Car is Driving
```

</p>
</details>


<h3> <----------------------------------------------------------> Adding Dynamic Values </h3> 

**Description**:
* Sometimes we need to pass values to the dependency injection on runtime. Such instances also can be achieved using the Dagger framework
* Example, When we need to inject a `Retrofit` into the screen, And we need to dynamically add a property for it.
* In the example we can see we are injecting a dynamic value of `storage` which is a integer and then the variable for `ram` stating if it is a boolean value.  

<details><summary>DEMO  -  click to view</summary>
<p>

**[Computer](app/src/main/java/com/demo/code/typesofdi/dagger/sampleone/concepts/dynamicValueInjection/computerParts/Computer.kt)**
     <->
     **[Ram](app/src/main/java/com/demo/code/typesofdi/dagger/sampleone/concepts/dynamicValueInjection/computerParts/Ram.kt)**
     <->
     **[Storage](app/src/main/java/com/demo/code/typesofdi/dagger/sampleone/concepts/dynamicValueInjection/computerParts/Storage.kt)**
     <-> 
     **[ComputerComponent](app/src/main/java/com/demo/code/typesofdi/dagger/sampleone/concepts/dynamicValueInjection/di/components/ComputerComponent.kt)**
     <->
     **[ComputerModule](app/src/main/java/com/demo/code/typesofdi/dagger/sampleone/concepts/dynamicValueInjection/di/modules/ComputerModule.kt)**
     <->
     **[DynamicValueInjectionFragment](app/src/main/java/com/demo/code/typesofdi/dagger/sampleone/concepts/dynamicValueInjection/view/DynamicValueInjectionFragment.kt)**
</p>
</details>

<details><summary>Output  -  click to view</summary>
<p>

```
2021-04-20 20:05:34.870 9462-9462/com.demo.code D/Dagger: Ram Init is invoked
2021-04-20 20:05:34.872 9462-9462/com.demo.code D/Dagger: Storage Init is invoked
2021-04-20 20:05:34.872 9462-9462/com.demo.code D/Dagger: Computer Init is invoked
2021-04-20 20:05:34.873 9462-9462/com.demo.code D/Dagger: Computer member function is invoked
2021-04-20 20:05:34.874 9462-9462/com.demo.code D/Dagger: Ram member function is invoked :: Is it a 2-GB RAM true
2021-04-20 20:05:34.874 9462-9462/com.demo.code D/Dagger: Storage member function is invoked :: Size of storage 250
```
</p>
</details>

<h3> <----------------------------------------------------------> Singleton Scope </h3> 

**Description**:
* Without a singleton scope if we inject a variable each time, A new instance of it is created each time.
* But using a Singleton scope, we can make sure whenever and no matter how many times we inject a variable, same instance is injected.
* Real world android example is using a Retrofit, every time in android, whenever we use it, can use same instance of it and such a way its efficient.
* Important point to note here is that, the singleton instance was a component level and not the application level.
* This is also a point when device gets rotated and component is recreated. So does the instance under it, even though its singleton, new instance is created.
* We can achieve this by adding the component into the application class. Because application class instance is not destroyed until the app is destroyed.

<details><summary>DEMO  -  click to view</summary>
<p>

**[UserComponent](app/src/main/java/com/demo/code/typesofdi/dagger/sampleone/concepts/singletonscope/di/components/UserComponent.kt)**
     <->
     **[BatteryModule](app/src/main/java/com/demo/code/typesofdi/dagger/sampleone/concepts/singletonscope/di/modules/BatteryModule.kt)**
     <->
     **[MobileModule](app/src/main/java/com/demo/code/typesofdi/dagger/sampleone/concepts/singletonscope/di/modules/MobileModule.kt)**
     <-> 
     **[ScreenModule](app/src/main/java/com/demo/code/typesofdi/dagger/sampleone/concepts/singletonscope/di/modules/ScreenModule.kt)**
     <->
     **[Battery](app/src/main/java/com/demo/code/typesofdi/dagger/sampleone/concepts/singletonscope/mobileParts/Battery.kt)**
     <->
     **[Mobile](app/src/main/java/com/demo/code/typesofdi/dagger/sampleone/concepts/singletonscope/mobileParts/Mobile.kt)**
      <->
     **[Screen](app/src/main/java/com/demo/code/typesofdi/dagger/sampleone/concepts/singletonscope/mobileParts/Screen.kt)**
      <->
     **[User](app/src/main/java/com/demo/code/typesofdi/dagger/sampleone/concepts/singletonscope/mobileParts/User.kt)**
      <->
     **[SingletonScopeFragment](app/src/main/java/com/demo/code/typesofdi/dagger/sampleone/concepts/singletonscope/view/SingletonScopeFragment.kt)**
</p>
</details>


<details><summary>Output  -  click to view</summary>
<p>

Once the class is loaded, we can see the `single instances`. Even though we we inject the user class twice, one instance is injected

```
2021-04-21 10:43:26.245 13148-13148/com.demo.code D/Dagger: Battery init block is invoked ::com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.mobileParts.Battery@c58e585
2021-04-21 10:43:26.245 13148-13148/com.demo.code D/Dagger: Screen init block is invoked ::com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.mobileParts.Screen@1a66fda
2021-04-21 10:43:26.246 13148-13148/com.demo.code D/Dagger: Mobile init block is invoked ::com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.mobileParts.Mobile@68e3c0b
2021-04-21 10:43:26.246 13148-13148/com.demo.code D/Dagger: User init block is invoked ::com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.mobileParts.User@c5d1ae8
```

Then when we execute the execute button on the screen. Observe the address of the objects, No duplicate objects are there. Also point to note that we annotate the module and the components as `singleton` and not the actual classes the module is instantiating. Only the user class we have annotated with `module`.

```
2021-04-21 10:44:15.047 13148-13148/com.demo.code D/Dagger: Currently Battery :: used is com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.mobileParts.Battery@c58e585
2021-04-21 10:44:15.047 13148-13148/com.demo.code D/Dagger: Currently Screen :: used is com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.mobileParts.Screen@1a66fda
2021-04-21 10:44:15.047 13148-13148/com.demo.code D/Dagger: Currently Mobile :: com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.mobileParts.Mobile@68e3c0b are using the components Battery :: com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.mobileParts.Battery@c58e585 Screen :: com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.mobileParts.Screen@1a66fda
2021-04-21 10:44:15.047 13148-13148/com.demo.code D/Dagger: Currently User :: com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.mobileParts.User@c5d1ae8 is using the mobile com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.mobileParts.Mobile@68e3c0b
2021-04-21 10:44:15.047 13148-13148/com.demo.code D/Dagger: Currently Battery :: used is com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.mobileParts.Battery@c58e585
2021-04-21 10:44:15.048 13148-13148/com.demo.code D/Dagger: Currently Screen :: used is com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.mobileParts.Screen@1a66fda
2021-04-21 10:44:15.048 13148-13148/com.demo.code D/Dagger: Currently Mobile :: com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.mobileParts.Mobile@68e3c0b are using the components Battery :: com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.mobileParts.Battery@c58e585 Screen :: com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.mobileParts.Screen@1a66fda
2021-04-21 10:44:15.048 13148-13148/com.demo.code D/Dagger: Currently User :: com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.mobileParts.User@c5d1ae8 is using the mobile com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.mobileParts.Mobile@68e3c0b
```



</p>
</details>


<h3> <----------------------------------------------------------> Custom Scope </h3> 


**Description**:
* Sometimes we need to create the scopes just on a `fragment level` of an `activity level`.
* Such instances we use `Custom Scopes`



---

<center><h2>Hilt</h2></center>

<p align="center">
  <img width="400" height="200" src="https://github.com/devrath/DroidDi/blob/main/images/dagger.jpeg">
</p>

| Concept |
| --- |
| [Constructor And Field Injection]() |

<h3> <----------------------------------------------------------> Constructor And Field Injection </h3> 
