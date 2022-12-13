package cucumber.steps


import io.cucumber.groovy.EN

this.metaClass.mixin(EN)

Given('i write {string} to console') { String verdi ->
    println "write $verdi to console"
}
