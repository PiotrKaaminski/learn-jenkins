
String profiles = ""
String modules = ""

void init() {
    String[] shProfiles = ["dev", "prod", "release"]
    String[] allProfiles = ["dev", "prod", "bik", "mvp", "release", "tauron"]
    String[] shModules = allProfiles - shProfiles

    for (String profile : shProfiles) {
        profiles += profile + ","
    }

    for (String module : shModules) {
        modules += module + ","
    }

}

return this