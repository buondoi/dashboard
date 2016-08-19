package com.apps.dashboard

import com.apps.dashboard.web.HomePage
import spock.lang.Specification

/**
 * Created on 8/19/16.
 */
class HomePageSpec extends Specification
{
    def 'verify returned view name of home page'()
    {
        setup:
        def homePage = new HomePage()

        expect:
        'index'.equals(homePage.load())
    }
}
