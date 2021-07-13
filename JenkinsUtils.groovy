String profiles() {
    String[] shProfiles = ["dev", "prod", "release"]
    String profiles = ""

    for (String profile : shProfiles) {
        profiles += profile + ","
    }
    return profiles
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