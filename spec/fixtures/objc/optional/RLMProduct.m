// DO NOT EDIT | Generated by dbgenerator

////////////////////////////////////////////////////////////////////////////////

#pragma mark - Imports

#import "RLMProduct.h"

#pragma mark - Defines & Constants

const struct RLMProductAttributes RLMProductAttributes = {
    .brand = @"brand",
    .name = @"name",
    .price = @"price"
};

////////////////////////////////////////////////////////////////////////////////

#pragma mark - Implementation

@implementation RLMProduct

#pragma mark - Superclass Overrides

// Specify required properties
+ (NSArray *)requiredProperties
{
    return @[@"name"];
}

// Specify default values for required properties
+ (NSDictionary *)defaultPropertyValues
{
    return @{@"name" : @""};
}

@end