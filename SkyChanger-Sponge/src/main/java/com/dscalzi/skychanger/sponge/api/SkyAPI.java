/*
 * This file is part of SkyChanger, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2017-2019 Daniel D. Scalzi <https://github.com/dscalzi/SkyChanger>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.dscalzi.skychanger.sponge.api;

import org.spongepowered.api.entity.living.player.Player;

public interface SkyAPI {

    /**
     * Change the sky for a player.
     * 
     * @param player
     *            The target of the sky change.
     * @param number
     *            The packet number which will determine the type of sky.
     * @return True if the sky change was successful, otherwise false.
     * 
     * @since 2.0.0
     */
    public boolean changeSky(Player player, float number);

    /**
     * Freeze a player.
     * 
     * @param player
     *            The target of the freeze.
     * @return True if the freeze was successful, otherwise false.
     * 
     * @since 2.0.0
     */
    public boolean freeze(Player player);

    /**
     * Unfreeze a player.
     * 
     * @param player
     *            The target of the unfreeze.
     * @return True if the unfreeze was successful, otherwise false.
     * 
     * @since 2.0.0
     */
    public boolean unfreeze(Player player);

}
