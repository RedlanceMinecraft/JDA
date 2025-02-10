package net.dv8tion.jda.api;

import javax.annotation.Nonnull;

/**
 * What platform is the discord client running on.
 */
public enum Platform {
    /**
     * Default
     */
    JDA("JDA"),

    /**
     *
     */
    DESKTOP("Discord Client"),

    /**
     *
     */
    WEB("Chrome"),

    /**
     *
     */
    MOBILE("Discord iOS"),

    /**
     *
     */
    EMBEDDED("Discord Embedded");

    private final String key;

    Platform(String key)
    {
        this.key = key;
    }

    /**
     * The valid API key for this Platform
     *
     * @return String representation of the valid API key for this Platform
     */
    @Nonnull
    public String getKey()
    {
        return key;
    }

    /**
     * Will get the {@link net.dv8tion.jda.api.Platform Platform} from the provided key.
     * <br>If the provided key does not have a matching Platform, this will return {@link net.dv8tion.jda.api.Platform#JDA JDA}
     *
     * @param  key
     *         The key relating to the {@link net.dv8tion.jda.api.Platform Platform} we wish to retrieve.
     *
     * @return The matching {@link net.dv8tion.jda.api.Platform Platform}. If there is no match, returns {@link net.dv8tion.jda.api.Platform#JDA JDA}.
     */
    @Nonnull
    public static Platform fromKey(@Nonnull String key)
    {
        for (Platform platform : values())
        {
            if (platform.key.equalsIgnoreCase(key))
            {
                return platform;
            }
        }
        return Platform.JDA;
    }
}
