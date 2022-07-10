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
package app.hellfire.inferno.provider;

import app.hellfire.inferno.Inferno;

/** An interface representing a provider of the Inferno API. */
public interface InfernoProvider {
    /** An enumeration of supported runtimes. */
    enum Runtime {
        /** The Bukkit runtime. */
        BUKKIT
    }

    /**
     * @return The runtime this provider supports.
     */
    Runtime getRuntime();

    /**
     * @return The Inferno instance.
     */
    Inferno getInferno();
}
