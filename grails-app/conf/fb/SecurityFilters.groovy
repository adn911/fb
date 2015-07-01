package fb

class SecurityFilters {

    def filters = {
        loginCheck(controller:'*', action:'*') {
            before = {

                def path = request.requestURI.substring(request.contextPath.length());

                if(path.contains("/assets/"))
                    return true;

                else if (!session.user &&
                        !controllerName.startsWith("auth")
                        && !controllerName.startsWith("signUp")) {
                    redirect(controller: "auth")
                    return false
                }

                else if ( session.user &&
                        ( (controllerName.startsWith("auth")
                                && !actionName?.startsWith("logout"))
                                || controllerName.startsWith("signUp")

                        ) ) {
                    redirect(controller: "home")
                    return false
                }
            }
            after = { Map model ->

            }
            afterView = { Exception e ->

            }
        }
    }
}