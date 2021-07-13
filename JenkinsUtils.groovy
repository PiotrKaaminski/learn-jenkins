

String profiles() {
    def shellResult = ('cd ' + env.WORKSPACE + ' && ./readProfiles.sh').execute().text
    return shellResult
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