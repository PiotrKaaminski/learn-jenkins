String profiles() {
    'chmod +x readProfiles.sh'.execute()
    def script = './readProfiles.sh'.execute()
    def sout = new StringBuffer(), serr = new StringBuffer()
    proc.consumeProcessOutput(sout, serr)
    println sout
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