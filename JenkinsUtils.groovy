

String profiles() {
    String script = "./readProfiles.sh".execute(null, new File(env.WORKSPACE)).text
    String[] profiles = script.split("\\n\\n")
    for (String profile : profiles) {
        println profile
    }
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