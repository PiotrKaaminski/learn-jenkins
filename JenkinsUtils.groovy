

String profiles() {
    println env.WORKSPACE
    def script = "cd " + env.WORKSPACE + " && pwd"
    println script
    return "test"
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