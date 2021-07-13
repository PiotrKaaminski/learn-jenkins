String profiles() {
    def script = 'sh readProfiles.sh'.execute().text
    /*def sout = new StringBuffer(), serr = new StringBuffer()
    script.consumeProcessOutput(sout, serr)
    println sout.toString()*/
    return script
}

String modules() {
    String[] shProfiles = ["dev", "prod", "release"]
    String[] allProfiles = ["dev", "prod", "bik", "mvp", "release", "tauron"]
    String[] shModules = allProfiles - shProfiles
    String modules = ""

    for (String module : shModules) {
        modules += module + ","
    }
    return modules
}

return this