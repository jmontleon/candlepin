Feature: Virtualization guest and host recognition
    As a consumer
    I want to correctly consume entitlements as a virtual guest

    Background:
        Given an owner admin "test_owner"
        And test owner has 2 entitlements for "virtualization_host"

    Scenario: A guest cannot consume virtual host entitlements
        Given I am a consumer "guest_consumer" of type "virt_system"
        Then attempting to Consume an entitlement for the "virtualization_host" product is forbidden
        And I Have 0 Entitlements
