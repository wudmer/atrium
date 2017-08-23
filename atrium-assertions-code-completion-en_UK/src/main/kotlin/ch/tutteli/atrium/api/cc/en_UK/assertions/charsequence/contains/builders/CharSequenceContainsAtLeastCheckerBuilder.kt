package ch.tutteli.atrium.api.cc.en_UK.assertions.charsequence.contains.builders

import ch.tutteli.atrium.api.cc.en_UK.atLeast
import ch.tutteli.atrium.api.cc.en_UK.containsNot
import ch.tutteli.atrium.assertions.charsequence.contains.CharSequenceContainsAssertionCreator.IDecorator
import ch.tutteli.atrium.assertions.charsequence.contains.builders.CharSequenceContainsAtLeastCheckerBuilderBase
import ch.tutteli.atrium.assertions.charsequence.contains.builders.CharSequenceContainsBuilder

open class CharSequenceContainsAtLeastCheckerBuilder<T : CharSequence, D : IDecorator>(
    times: Int,
    containsBuilder: CharSequenceContainsBuilder<T, D>
) : CharSequenceContainsAtLeastCheckerBuilderBase<T, D>(
    times,
    containsBuilder,
    containsBuilder.plant::containsNot.name,
    containsBuilder::atLeast.name
)

