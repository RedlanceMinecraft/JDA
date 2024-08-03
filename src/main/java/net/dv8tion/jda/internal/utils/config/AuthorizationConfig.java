/*
 * Copyright 2015 Austin Keener, Michael Ritter, Florian Spieß, and the JDA contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.dv8tion.jda.internal.utils.config;

import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.internal.utils.Checks;

import javax.annotation.Nonnull;

public final class AuthorizationConfig
{
    private AccountType type;
    private String token;

    public AuthorizationConfig(@Nonnull String token)
    {
        this(AccountType.BOT, token);
    }

    public AuthorizationConfig(@Nonnull AccountType type, @Nonnull String token)
    {
        Checks.notEmpty(token, "Token");
        Checks.noWhitespace(token, "Token");
        setToken(type, token);
    }

    @Nonnull
    public String getToken()
    {
        return type.prefix + token;
    }

    @Nonnull
    public AccountType getAccountType()
    {
        return type;
    }

    public void setToken(@Nonnull String token)
    {
        setToken(AccountType.BOT, token);
    }

    public void setToken(@Nonnull AccountType type, @Nonnull String token)
    {
        this.type = type;
        this.token = token;
    }
}
