/*
 * This file is part of Bisq.
 *
 * Bisq is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at
 * your option) any later version.
 *
 * Bisq is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Bisq. If not, see <http://www.gnu.org/licenses/>.
 */

package network.misq.common.currency;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@ToString
public final class CryptoCurrency extends MisqCurrency {
    // http://boschista.deviantart.com/journal/Cool-ASCII-Symbols-214218618
    private final static String PREFIX = "✦ ";

    @Getter
    private final boolean isAsset;

    public CryptoCurrency(String currencyCode,
                          String name) {
        this(currencyCode, name, false);
    }

    public CryptoCurrency(String currencyCode,
                          String name,
                          boolean isAsset) {
        super(currencyCode, name);

        this.isAsset = isAsset;
    }

    @Override
    public String getDisplayPrefix() {
        return PREFIX;
    }

}
