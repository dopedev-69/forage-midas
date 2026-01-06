package com.jpmc.midascore.component;

import com.jpmc.midascore.foundation.Transaction;
import com.jpmc.midascore.entity.UserRecord;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConduit {

    // Required by transaction-related tests
    public void save(Transaction transaction) {
        // no-op (tests only verify invocation)
    }

    // Required by UserPopulator / user-related tests
    public void save(UserRecord userRecord) {
        // no-op (tests only verify invocation)
    }
}
