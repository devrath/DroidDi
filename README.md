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


| Quick Reference | sample branch | Demo classes |
| --- | --- | --- |
| [Constructor Injection](https://github.com/devrath/DroidDi/blob/main/README.md#------------------------------------------------------------constructor-injection-) | `main_dagger_constructor-injection` | demo |
| [Field Injection](https://github.com/devrath/DroidDi/blob/main/README.md#------------------------------------------------------------field-injection-) | `main_dagger_field-injection` | demo |
| [Provides Annotation](https://github.com/devrath/DroidDi/blob/main/README.md#------------------------------------------------------------provides-annotation-) | `main_dagger_provides-annotation` | demo |
| [Binds Annotation](https://github.com/devrath/DroidDi/blob/main/README.md#------------------------------------------------------------binds-annotation-) | `main_dagger_binds` | demo |



<h3> <----------------------------------------------------------> Constructor Injection </h3> 

**Branch**: `main_dagger_constructor-injection`

**Description**:

* Here we have `Car` class. The class has 2 dependencies `Wheels`,`Engine`. Here using the process of dependency injection, we create the dependencies of the `Wheels` and `Engine` outside and provide the dependecy via the constructor, so that the instantiation of the components inside the car is not necessary be done inside the car class.
* We need to use constructor injection wherever necessary.  

<details><summary>Code  -  click to view</summary>
<p>

`AutomobileFragment.kt`
```kotlin
class AutomobileFragment : Fragment() {

    private lateinit var _binding: AutomobileFragmentBinding
    private val binding get() = _binding

    private lateinit var viewModel: AutomobileViewModel
    
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(AutomobileViewModel::class.java)
        _binding = AutomobileFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Here using the generated Car component - we can access the interface method -- then get hold of drive method 
        DaggerCarComponent.builder().build().getCar().drive()
    }
    
}
```

`CarComponent.kt`
```kotlin
/**
 * Component is the backbone of dagger - >
 * The component of dagger generates something called the dependency graph
 * The dependency graph is unidirectional - meaning there is no cyclic interdependency among them
 * **************************
 * The annotation is something that turns a class into usable code
 */
@Component
interface CarComponent {

    /**
     * Return type: It is the Class object we are trying to build
     * Name of the function is not important but it makes sense to have something meaningful.
     * **************************
     * We don't have to specify how to build this class, because dagger does this for us
     */
    fun getCar() : Car

}
```

`Engine.kt`
```kotlin
/**
 * Engine is a object which is annotated with @Inject
 * With this annotation Engine is made available for the dependency graph
 */
class Engine @Inject constructor() {
    private val TAG = "Dagger"
    init {
        Log.d(TAG, "Engine is constructed")
    }
}
```

`Wheels.kt`
```kotlin
/**
 * Wheels is a object which is annotated with @Inject
 * With this annotation Wheels is made available for the dependency graph
 */
class Wheels @Inject constructor() {
    private val TAG = "Dagger"
    init {
        Log.d(TAG, "Wheel is constructed")
    }
}
```

`Car.kt`
```kotlin
/**
 * Car object - requires two parameters Engine and Wheels
 * There is constructor injection which is injecting 2 objects
 * Car object consumes Engine and Wheels
 * ******************
 * Car is having the dependency on two objects Engine and Wheels
 */
class Car @Inject constructor(var engine: Engine, var wheels: Wheels) {
    private val TAG = "Dagger"
    fun drive() {
        Log.d(TAG, "Car is Driving")
    }
}
```
</p>
</details>

<details><summary>Output  -  click to view </summary>
<p>
  
```
2021-04-04 12:19:24.877 22966-22966/com.demo.code D/Dagger: Engine is constructed
2021-04-04 12:19:24.877 22966-22966/com.demo.code D/Dagger: Wheel is constructed
2021-04-04 12:19:24.877 22966-22966/com.demo.code D/Dagger: Car is Driving
```

</p>
</details>



<h3> <----------------------------------------------------------> Field Injection </h3> 
  
**Branch**: `main_dagger_field-injection`

**Description**:
* The field injection is used wherever the `constructor injection` is not possible.
* Most of the scenarios in android, where we want to use a third party library, we use `field injection`
* We use `@Inject` annotation with public access specifier.
* As a thumb rule, Field Injection is used for framework types

<details><summary>Code  -  click to view </summary>
<p>
  
`AutomobileFragment.kt`
```kotlin
class AutomobileFragment : Fragment() {

    private lateinit var _binding: AutomobileFragmentBinding
    private val binding get() = _binding

    private lateinit var viewModel: AutomobileViewModel

    // Field Injection - It is done here
    @Inject
    lateinit var car: Car

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(AutomobileViewModel::class.java)
        _binding = AutomobileFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Here we inject the car instance for this calss
        DaggerCarComponent.create().inject(this)
        car.drive()
    }

}
```

`CarComponent.kt`
```kotlin
@Component
interface CarComponent {
   fun inject(atomobileFragment : AutomobileFragment)
}
```

`Car.kt`
```kotlin
class Car @Inject constructor(var engine: Engine, var wheels: Wheels) {
    private val TAG = "Dagger"
    fun drive() {
        Log.d(TAG, "Car is Driving")
    }
}
```

`Engine.kt`
```kotlin
class Engine @Inject constructor() {
    private val TAG = "Dagger"
    init {
        Log.d(TAG, "Engine is constructed")
    }
}
```

`Wheels.kt`
```kotlin
class Wheels @Inject constructor() {
    private val TAG = "Dagger"
    init {
        Log.d(TAG, "Wheel is constructed")
    }
}
```

</p>
</details>


<details><summary>Output  -  click to view </summary>
<p>
  
```
2021-04-04 12:19:24.877 22966-22966/com.demo.code D/Dagger: Engine is constructed
2021-04-04 12:19:24.877 22966-22966/com.demo.code D/Dagger: Wheel is constructed
2021-04-04 12:19:24.877 22966-22966/com.demo.code D/Dagger: Car is Driving
```

</p>
</details>

---

<h3> <----------------------------------------------------------> Provides Annotation </h3> 

**Branch**: `main_dagger_provides-annotation`

**Description**:
* From the examples above we saw that we might need to annotate the constructor of the object we are constructing.
* Most of the time the constructor we are annotating are of third party libraries, We don't have access to third party libraries.
* Using the `@Provides` annotation, we can use it.



<details><summary>Code  -  click to view </summary>
<p>

`AutomobileFragment.kt`
```kotlin
class AutomobileFragment : Fragment() {

    private lateinit var _binding: AutomobileFragmentBinding
    private val binding get() = _binding

    private lateinit var viewModel: AutomobileViewModel

    // Field Injection - It is done here
    @Inject
    lateinit var car: Car

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(AutomobileViewModel::class.java)
        _binding = AutomobileFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Here we inject the car instance for this calss
        DaggerCarComponent.create().inject(this)
        car.drive()
    }

}
```

`CarComponent.kt`
```kotlin
@Component(modules = [WheelsModule::class])
interface CarComponent {
   fun inject(automobileFragment : AutomobileFragment)
}
```

`WheelsModule.kt`
```kotlin
@Module
class WheelsModule {

    @Provides
    fun providesRims() : Rims {
        return Rims()
    }

    @Provides
    fun providesTires() : Tires {
        // This is optional, If we need to define how the tire to be constructed
        val configuredTires = Tires()
        configuredTires.constructTires()
        return configuredTires
    }

    @Provides
    fun providesWheels(rims:Rims,tires:Tires) : Wheels {
        return Wheels(rims,tires)
    }

}
```

`Wheels.kt`
```kotlin
/**
 * Here this class is a third party - So we can't edit it and add provides method
 * Also it has dependency on two other classes rims and tires which is further a third party classes
 */
class Wheels constructor(var rims: Rims,var tires: Tires) {
    //we don't own this class so we can't annotate it with @Inject

    private val TAG = "Dagger"

    init {
        Log.d(TAG, "Wheel is constructed")
    }


}
```

`Rims.kt`
```kotlin
class Rims {
    //we don't own this class so we can't annotate it with @Inject

    private val TAG = "Dagger"

    init {
        Log.d(TAG, "Rims are constructed")
    }

}
```

`Tires.kt`
```kotlin
class Tires {
    //we don't own this class so we can't annotate it with @Inject

    private val TAG = "Dagger"

    init {
        Log.d(TAG, "Tires are constructed")
    }

    fun constructTires() {
        Log.d(TAG, "Tires inflated")
    }

}
```

`Engine.kt`
```kotlin
class Engine @Inject constructor() {
    private val TAG = "Dagger"
    init {
        Log.d(TAG, "Engine is constructed")
    }
}
```

`Car.kt`
```kotlin
class Car @Inject constructor(var engine: Engine, var wheels: Wheels) {
    private val TAG = "Dagger"
    fun drive() {
        Log.d(TAG, "Car is Driving")
    }
}
```

</p>
</details>



<details><summary>Output  -  click to view </summary>
<p>
  
```
2021-04-04 19:04:12.607 7964-7964/com.demo.code D/Dagger: Engine is constructed
2021-04-04 19:04:12.607 7964-7964/com.demo.code D/Dagger: Rims are constructed
2021-04-04 19:04:12.607 7964-7964/com.demo.code D/Dagger: Tires are constructed
2021-04-04 19:04:12.607 7964-7964/com.demo.code D/Dagger: Tires inflated
2021-04-04 19:04:12.607 7964-7964/com.demo.code D/Dagger: Wheel is constructed
2021-04-04 19:04:12.607 7964-7964/com.demo.code D/Dagger: Car is Driving
```

</p>
</details>

<h3> <----------------------------------------------------------> Binds Annotation </h3> 
 
**Branch**: `main_dagger_binds`

**Description**:
* Now there are scenarios when we need to inject a `interface` instead of a `class`, In such scenarios we use `Binds` annotation
* We can't create a module directly for a interface but instead, we will make a class implement the imterface and create a module of that class
* We shall keep the class as `abstract` as a standard practice, even though we can implement in a standard way
* Now in a scenario, if we have two modules implementing same interface, then we will get a error because dagger dosen't know which one to use


<details><summary>Code  -  click to view </summary>
<p>
  
`AutomobileFragment.kt`
```kotlin
class AutomobileFragment : Fragment() {

    private lateinit var _binding: AutomobileFragmentBinding
    private val binding get() = _binding

    private lateinit var viewModel: AutomobileViewModel

    // Field Injection - It is done here
    @Inject
    lateinit var car: Car

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(AutomobileViewModel::class.java)
        _binding = AutomobileFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Here we inject the car instance for this calss
        DaggerCarComponent.create().inject(this)
        car.drive()
    }

}
```

`CarComponent.kt`
```kotlin
@Component(modules = [PetrolEngineModule::class])
interface CarComponent {
   fun inject(atomobileFragment : AutomobileFragment)
}
```

`Engine.kt`
```kotlin
interface Engine {
    fun start()
}
```

`PetrolEngine.kt`
```kotlin
class PetrolEngine @Inject constructor(): Engine {

    private val TAG = "Dagger"

    override fun start() {
        Log.d(TAG, "Petrol engine started")
    }

}
```

`PetrolEngineModule.kt`
```kotlin
@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun bindsEngine(petrolEngine:PetrolEngine) : Engine

}
```

`Car.kt`
```kotlin
class Car @Inject constructor(var engine: Engine, var wheels: Wheels) {
    private val TAG = "Dagger"
    fun drive() {
        engine.start()
        Log.d(TAG, "Car is Driving")
    }
}
```

`Wheels.kt`
```kotlin
class Wheels @Inject constructor() {
    private val TAG = "Dagger"
    init {
        Log.d(TAG, "Wheel is constructed")
    }
}
```

</p>
</details>




<details><summary>Output  -  click to view </summary>
<p>
  
```
2021-04-04 21:46:56.583 26142-26142/com.demo.code D/Dagger: Wheel is constructed
2021-04-04 21:46:56.583 26142-26142/com.demo.code D/Dagger: Petrol engine started
2021-04-04 21:46:56.583 26142-26142/com.demo.code D/Dagger: Car is Driving
```

</p>
</details>
