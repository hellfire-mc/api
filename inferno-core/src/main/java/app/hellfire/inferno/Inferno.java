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

import app.hellfire.inferno.provider.InfernoProvider;

/**
 * The main Inferno API interface.
 *
 * <p>This interface can be used to interface between your plugins, and the server running
 * underneath, regardless of platform or runtime.
 */
public interface Inferno {
    /**
     * Register an Inferno API provider.
     *
     * @param provider The Inferno API provider.
     * @since 0.1.0
     */
    static void registerInfernoProvider(InfernoProvider provider) {
        InfernoContainer.setProvider(provider);
    }
}
