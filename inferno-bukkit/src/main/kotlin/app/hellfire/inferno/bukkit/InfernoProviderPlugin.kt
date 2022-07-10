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
package app.hellfire.inferno.bukkit

import app.hellfire.inferno.Inferno
import app.hellfire.inferno.provider.InfernoProvider
import org.bukkit.plugin.java.JavaPlugin

// @DeclarePlugin(name = "Inferno", version = "0.1.0")
// @Description("The Inferno API provider for Bukkit.")
// @LoadOrder(PluginLoadOrder.STARTUP)
// @Author("Kaylen Dart <actuallyori@gmail.com>")
// @LogPrefix("Inferno")
class InfernoProviderPlugin : InfernoProvider, JavaPlugin() {
    override fun onLoad() {
        this.logger.info("Registering Inferno API provider...")
        Inferno.registerInfernoProvider(this)
    }

    override fun getRuntime(): InfernoProvider.Runtime {
        return InfernoProvider.Runtime.BUKKIT
    }

    override fun getInferno(): Inferno {
        return InfernoBukkit
    }
}
