/**
 * Copyright (c) 2015 Bosch Software Innovations GmbH and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.hawkbit.repository;

import org.eclipse.hawkbit.repository.model.ActionStatus;
import org.eclipse.hawkbit.repository.model.Target;

/**
 * Repository constants.
 *
 */
public final class Constants {

    /**
     * Prefix that the server puts in front of
     * {@link ActionStatus#getMessages()} is the comments was generated by it
     * and not be thy {@link Target}.
     */
    public static final String SERVER_MESSAGE_PREFIX = "Update Server: ";

    private Constants() {
        // Utility class.
    }

}
