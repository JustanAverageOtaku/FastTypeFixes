package io.spitefulgoat.fasttypefixes

import ai.vyro.languagetool.di.languageToolModule
import ai.vyro.languagetool.entities.network.AnalyzerEndpoint
import org.koin.core.KoinApplication
import org.koin.core.context.startKoin
import org.koin.core.definition.Definition
import org.koin.dsl.module



internal val analyzer: Definition<AnalyzerEndpoint> = {
    AnalyzerEndpoint("https://languagetool-predictor-default.default.cluster.vyro-dfw-1.lstn.net/v2")
}

internal val dependencies = module {
    includes(languageToolModule(analyzer))
}

fun startSharedKoin(action: KoinApplication.() -> Unit) {
    startKoin {
        modules(dependencies)

        action()
    }
}