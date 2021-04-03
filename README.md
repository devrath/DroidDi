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

| Quick Reference |
| --- |
| [Dagger](https://github.com/devrath/DroidDi/blob/main/README.md#dagger "Dagger2") |
| Koin |
| Hilt |


<h2>Dagger</h2>

<p align="center">
  <img width="400" height="200" src="https://github.com/devrath/DroidDi/blob/main/images/dagger.jpeg">
</p>
