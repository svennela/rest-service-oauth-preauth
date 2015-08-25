package hello;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;
import hello.data.User;
import java.io.Serializable;
import org.springframework.stereotype.Component;
@Component
public class BasicPermissionEvaluator implements PermissionEvaluator {

    private static Logger logger = LoggerFactory.getLogger(BasicPermissionEvaluator.class);

    @Override
    public boolean hasPermission(Authentication authentication, Object targetDomainObject, Object permission) {
        logger.info(""+authentication.getPrincipal());
        logger.info(""+targetDomainObject);
        logger.info(""+permission);

        /*

        DartUser dartUser = (DartUser)authentication.getPrincipal();
        String permissionType = (String)o2;
        String value = (String)o;

        switch(permissionType) {
            case "isLeagueAdmin":
                return hasLeaguePermission(dartUser, value, "ROLE_ADMIN");
            case "isLeagueUser":
                return hasLeaguePermission(dartUser, value, "ROLE_USER");
            default:
                return false;
        }
        */

        return true;
    }

    @Override
    public boolean hasPermission(Authentication authentication,
    Serializable targetId, String targetType, Object permission) {
        logger.info("*******"+authentication.getPrincipal());
        logger.info("******"+targetId);
        logger.info("******"+targetType);
        logger.info("*****"+permission);
      return true;
    }


    public boolean hasAccoutUpdatePermission(User user,
     String targetType,  String roleType) {
        logger.info(""+user.getLogin());
        logger.info(""+targetType);
        logger.info(""+roleType);

      return true;
    }
}
