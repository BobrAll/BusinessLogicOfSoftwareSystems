package bobr.blps_lab.subscription;

import bobr.blps_lab.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SubscriptionAutoUpdater {
    private final UserService userService;

    @Scheduled(cron = "${SUBSCRIPTION_RENEW_PERIOD}")
    public void renew() {
        userService
                .findUsersWithLessThanOneDaySubscription()
                .forEach(userService::buySubscription);
    }
}
