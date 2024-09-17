package br.com.alura.musicasBD.dados

import javax.persistence.EntityManager
import javax.persistence.Persistence

object Banco {
    fun getEntityManager(): EntityManager{
        val factory = Persistence.createEntityManagerFactory("musicas", mapOf(
            "javax.persistence.jdbc.user" to System.getenv("DB_USER"),
            "javax.persistence.jdbc.password" to System.getenv("DB_PASSWORD")
        ))
        return factory.createEntityManager()
    }
}