

String profiles() {
    def workingDir = 'pwd'.execute().text
    println workingDir
    def script = './readProfiles.sh'.execute().text
    println script
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