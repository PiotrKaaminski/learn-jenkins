

String profiles() {
    def build = this.getProperty('binding').getVariable('build')
    def listener = this.getProperty('binding').getVariable('listener')
    def env = build.getEnvironment(listener)
    println env.WORKSPACE
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