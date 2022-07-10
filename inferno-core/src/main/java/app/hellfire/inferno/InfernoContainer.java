/* Copyright (c) 2022 - Kaylen Dart and contributors. All rights reserved.
 *
 * This file is part of Hellfire Inferno.
 *
 * Hellfire Inferno is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser General
 * Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 *
 * Foobar is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with Foobar. If not, see
 * <https://www.gnu.org/licenses/>.
 */
package app.hellfire.inferno;

import app.hellfire.inferno.exception.ExistingProviderException;
import app.hellfire.inferno.exception.MissingProviderException;
import app.hellfire.inferno.provider.InfernoProvider;

/** An internal container class, used to store the */
final class InfernoContainer {
    /** The active provider instance. */
    static InfernoProvider provider = null;

    /**
     * @return The active Inferno provider.
     */
    static InfernoProvider getProvider() {
        if (provider == null) {
            throw new MissingProviderException();
        }
        return provider;
    }

    /**
     * Set the active Inferno provider. This method may only be called once.
     *
     * @param provider The provider.
     */
    static void setProvider(InfernoProvider provider) {
        if (InfernoContainer.provider != null) {
            throw new ExistingProviderException(
                    provider.getClass(), InfernoContainer.provider.getClass());
        }
        InfernoContainer.provider = provider;
    }

    private InfernoContainer() {
        throw new RuntimeException("Cannot instantiate class 'InfernoContainer'");
    }
}
