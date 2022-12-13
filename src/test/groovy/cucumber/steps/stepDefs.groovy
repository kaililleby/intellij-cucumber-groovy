package cucumber.steps


import io.cucumber.groovy.EN

this.metaClass.mixin(EN)

Given('i write {string} to console') { String verdi ->
    println "i write $verdi to console"
}

Given(~'^you write "(.*)" to console$') { String verdi ->
    println "you write $verdi to console"
}
