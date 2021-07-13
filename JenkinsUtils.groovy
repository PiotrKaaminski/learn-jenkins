import java.util.stream.Collectors

Map<String, String> profiles() {
    List<String> scriptResult = "./readProfiles.sh".execute(null, new File(env.WORKSPACE)).text.split("\\n\\n")
    List<String[]> profilesList = scriptResult.forEach(profile -> {
        return profile.split("\\n")
    }).collect(Collectors.toList())
    String[] modules = profilesList.get(1) - profilesList.get(0)
    Map<String, String> valuesMap = new HashMap<>()
    valuesMap.put("buildProfiles", convertToValues(profilesList.get(0)))
    valuesMap.put("modules", convertToValues(modules))
    return valuesMap
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

private String convertToValues(String[] arr) {
    StringBuilder sb = new StringBuilder()
    for (String temp : arr) {
        sb.append(temp).append(",")
    }
    return sb.toString()
}

return this