package com.example.hongjun.todoapp.component

import com.example.hongjun.todoapp.dao.TodoDao
import com.example.hongjun.todoapp.model.TodoDaoImpl
import com.example.hongjun.todoapp.module.AppModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

    //provision method
    fun make(): TodoDao
    //member-injection method
    fun inject(todoDaoImpl: TodoDaoImpl)
}