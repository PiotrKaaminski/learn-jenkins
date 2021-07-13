def getProfiles() {
    ArrayList<String> mainProfiles = ["release", "prod", "dev"]
    ArrayList<String> allProfiles = ["release", "bik", "mvp", "dev", "tauron", "prod"]
    ArrayList<String> modules = allProfiles - mainProfiles
    StringBuilder profiles = new StringBuilder();
    for (String module : modules) {
        profiles.append(module).append(",");
    }
    profiles.deleteCharAt(profiles.length())
    return profiles.toString()
}

return this