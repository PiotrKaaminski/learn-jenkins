def getProfiles() {
    ArrayList<String> mainProfiles = ["release", "prod", "dev"]
    ArrayList<String> allProfiles = ["release", "bik", "mvp", "dev", "tauron", "prod"]
    ArrayList<String> modules = allProfiles - mainProfiles
    return "test,test2,test3,test4"
}

return this