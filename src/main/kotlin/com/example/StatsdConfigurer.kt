package com.example

import io.micrometer.statsd.StatsdMeterRegistry
import io.micronaut.configuration.metrics.aggregator.MeterRegistryConfigurer
import javax.inject.Singleton

@Singleton
class StatsdConfigurer : MeterRegistryConfigurer<StatsdMeterRegistry> {

    override fun configure(meterRegistry: StatsdMeterRegistry) {
        meterRegistry.config().commonTags("key", "value")
    }

    override fun supports(meterRegistry: StatsdMeterRegistry): Boolean {
        return true
    }
}