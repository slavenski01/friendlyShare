package com.example.`module-injector-app`

interface ComponentHolder<C : BaseAPI, D : BaseDependencies> {
    fun init(dependencies: D)

    fun get(): C

    fun reset()
}

interface BaseDependencies

interface BaseAPI